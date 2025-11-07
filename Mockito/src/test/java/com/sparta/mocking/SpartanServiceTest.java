package com.sparta.mocking;

import com.sparta.mocking.model.Spartan;
import com.sparta.mocking.repository.Repository;
import com.sparta.mocking.repository.SpartanListRepository;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

public class SpartanServiceTest {

    private SpartanService sut;
    private Repository mockRepository;

    @BeforeEach
    public void setUp(){
        mockRepository = Mockito.mock(Repository.class);
        // mockRepository is acting like a dummy
        sut = new SpartanService(mockRepository);
    }


    @Test
    @DisplayName("Given a list of two Spartans getNumSpartans returns 2")
    public void givenListOfTwoSpartans_getNumSpartans_Returns2(){
        List<Spartan> spartans = new ArrayList<>();
        spartans.add(Mockito.mock(Spartan.class));
        spartans.add(Mockito.mock(Spartan.class));
        // my stub!
        Mockito.when(mockRepository.getAll()).thenReturn(spartans);
        var result = sut.getNumSpartans();
        assertThat(result, is(2));
    }

    @Test
    @DisplayName("Given a Spartan exists, findSpartan should return it")
    void givenSpartanExists_findSpartan_ReturnsSpartan() {
        Mockito.when(mockRepository.find(Mockito.anyInt()))
                .thenReturn(Mockito.mock(Spartan.class));
        var result = sut.findSpartan(Mockito.anyInt());
        assertThat(result, instanceOf(Spartan.class));
    }

    @Test
    @DisplayName("Given a Spartan doesn't exist, findSpartan should throw a RuntimeException")
    void givenSpartanDoesNotExist_findSpartan_ThrowsRuntimeException() {
        Mockito.when(mockRepository.find(Mockito.anyInt()))
                .thenThrow(new NoSuchElementException());
        Assertions.assertThrows(RuntimeException.class, () -> sut.findSpartan(1));
    }

    @Test
    @DisplayName("Check find is called once")
    public void checkFindIsCalledOnceOnRepository(){
        sut.findSpartan(1);
        Mockito.verify(mockRepository).find(1);
    }

    @Test
    @DisplayName("Test correct parameter passed")
    void testCorrectParameterPassed() {
        Spartan spartan = new Spartan("Nish", "Java", LocalDate.now());
        sut.addSpartan(spartan);
        Mockito.verify(mockRepository).add(spartan);
    }
    //Remove Spartan
    @Test
    @DisplayName("Given a Spartan doesn't exist, removeSpartan should throw a NoSuchElementException")
    void givenSpartanDoesNotExist_removeSpartan_NoSuchElementException() {
        Mockito.when(mockRepository.remove(Mockito.anyInt()))
                .thenThrow(new NoSuchElementException());
        Assertions.assertThrows(NoSuchElementException.class, () -> sut.removeSpartan(1));
    }

    @Test
    @DisplayName("Test correct Spartan removed")
    void testCorrectSpartanRemoved() {
        Mockito.when(mockRepository.remove(Mockito.anyInt())).thenReturn(true);
        var result = sut.removeSpartan(Mockito.anyInt());
        assertThat(result, is(true));
        Mockito.verify(mockRepository).remove(Mockito.anyInt());
    }
    @Test
    @DisplayName("Test no Spartan was removed with false result")
    void testNoSpartanRemoved() {
        Mockito.when(mockRepository.remove(Mockito.anyInt())).thenReturn(false);
        var result = sut.removeSpartan(Mockito.anyInt());
        assertThat(result, is(false));
        Mockito.verify(mockRepository).remove(Mockito.anyInt());
    }

    //getSpartansCreatedLast24Hours

    @Test
    @DisplayName("Test getSpartansCreatedLast24Hours gives new Spartan")
    void getSpartansCreatedLast24Hours() {
        List<Spartan> spartans = new ArrayList<>();
        Spartan spartan = Mockito.mock(Spartan.class);
        Mockito.when(spartan.getStartDate()).thenReturn(LocalDate.now());
        sut.addSpartan(spartan);

        Mockito.when(mockRepository.getAll()).thenReturn(spartans);

        var result = sut.getSpartansCreatedLast24Hours();
        assertThat(result, is(spartans));
        Mockito.verify(mockRepository).getAll();
    }

    @Test
    @DisplayName("Test getSpartansCreatedLast24Hours gives no Spartans")
    void getSpartansCreatedLast24HoursNoSpartans() {
        List<Spartan> spartans = new ArrayList<>();
        Spartan spartan = Mockito.mock(Spartan.class);
        Mockito.when(spartan.getStartDate()).thenReturn(LocalDate.now().plusDays(1));
        sut.addSpartan(spartan);

        List<Spartan> newSpartans = new ArrayList<>();
        Mockito.when(mockRepository.getAll()).thenReturn(newSpartans);

        var result = sut.getSpartansCreatedLast24Hours();
        assertThat(result, is(newSpartans));
        Mockito.verify(mockRepository).getAll();
    }
}

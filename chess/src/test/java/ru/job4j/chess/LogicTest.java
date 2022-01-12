package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class LogicTest {

    //@Ignore
    @Test
    public void whenCorrectMove()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        String exc = "";
        try {
            logic.move(Cell.C1, Cell.H6);
        } catch (Exception e) {
            exc = e.getClass().getName();
        }
        assertThat("", is(exc));
    }

    @Test
    public void whenFigureNotFound()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C2));
        String exc = "";
        try {
            logic.move(Cell.C1, Cell.H6);
        } catch (Exception e) {
            exc = e.getClass().getName();
        }
        assertThat("ru.job4j.chess.FigureNotFoundException", is(exc));
    }

    @Test
    public void whenOccupiedCell()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new BishopBlack(Cell.D2));
        String exc = "";
        try {
            logic.move(Cell.C1, Cell.H6);
        } catch (Exception e) {
            exc = e.getClass().getName();
        }
        assertThat("ru.job4j.chess.OccupiedCellException", is(exc));

    }

    @Test
    public void whenImpossibleMove()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        //logic.add(new BishopBlack(Cell.D2));
        String exc = "";
        try {
            logic.move(Cell.C1, Cell.H7);
        } catch (Exception e) {
            exc = e.getClass().getName();
        }
        assertThat("ru.job4j.chess.ImpossibleMoveException", is(exc));
    }
}
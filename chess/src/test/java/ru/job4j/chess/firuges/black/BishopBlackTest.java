package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {

    @Test
    public void whenPositionC8ThenC8() {
        Cell positionIn = Cell.C8;
        Figure bishopBlack = new BishopBlack(positionIn);
        Cell positionOut = bishopBlack.position();
        assertThat(positionIn, is(positionOut));
    }

    @Test
    public void whenCopyD7ThenD7() {
        Figure bishopBlack = new BishopBlack(Cell.C8);
        Cell positionDest = Cell.D7;
        Figure bishopBlackCopy = bishopBlack.copy(positionDest);
        Cell positionOut = bishopBlackCopy.position();
        assertThat(positionDest, is(positionOut));
    }

    @Test
    public void whenWayC1G5ThenD2E3F4G5() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        Cell positionDest = Cell.G5;
        Cell[] way = bishopBlack.way(positionDest);
        Cell[] wayToTest = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(wayToTest, is(way));
    }
}
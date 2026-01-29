package com.tictactoe.Board;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BoardTest {
public Board board;

@Before
public void setUp(){
    board=new Board();
}

@Test
public void testBoardStartsEmpty(){
    for(int row=0;row<3;row++){
        for(int col=0;col<3;col++){
            assertEquals(' ', board.getCell(row, col));
            assertTrue(board.isCellEmpty(row, col));
        }
    }
}

@Test
public void testSetAndGetCell(){
    board.setCell(1, 2, 'X');
    assertEquals('X', board.getCell(1, 2));
    assertFalse(board.isCellEmpty(1, 2));
}


@Test
public void testIsInBounds(){
    assertTrue(board.isInBounds(0, 0));
    assertTrue(board.isInBounds(2, 2));

    assertFalse(board.isInBounds(-1, 0));
    assertFalse(board.isInBounds(0, -1));
    assertFalse(board.isInBounds(0, 3));
    assertFalse(board.isInBounds(3, 0));
}

@Test
public void testResetClearsBoard(){
    board.setCell(1, 1, 'X');
    board.setCell(2, 2, 'O');

    board.reset();

    for(int row=0; row<3;row++){
        for(int col=0;col<3;col++){
            assertEquals(' ', board.getCell(row, col));
        }
    }
}
}

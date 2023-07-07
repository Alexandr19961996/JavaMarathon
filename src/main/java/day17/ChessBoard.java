package day17;

public class ChessBoard {
    private ChessPiece[][] chessPieces;

    ChessBoard(ChessPiece[][] chessPieces) {
        this.chessPieces = chessPieces;
    }

    public void print() {
        for (ChessPiece[] value : chessPieces) {
            for (ChessPiece i : value) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

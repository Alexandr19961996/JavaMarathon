package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] chessPiece = new ChessPiece[]{
                ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
                ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK};
        for (ChessPiece value : chessPiece) {
            System.out.print(value + " ");
        }
    }
}
public class TextModeBoardPresenter implements BoardPresenter{

    @Override
    public void displayBoard(Board board) {
        String formattedBoard = "";
        for (int i = 0; i < board.size * board.size; i++) {
            String boarderOrNewline = "";
            if ( (i + 1) % board.size == 0) { // end of row
                if ( (i + 1) % (board.size * board.size) != 0 ) // except the end of last row
                    boarderOrNewline = "\n";
            } else boarderOrNewline = " | ";
            formattedBoard += board.spots.get(i);
            formattedBoard += boarderOrNewline;
        }
        System.out.print(formattedBoard);
    }
}

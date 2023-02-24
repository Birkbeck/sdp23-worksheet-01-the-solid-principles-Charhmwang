import java.util.ArrayList;
import java.util.List;

public class Board {
    List<String> spots;
    int size;
    BoardPresenter presenter;

    public Board() {this(3, new TextModeBoardPresenter());}

    public Board(int size, BoardPresenter presenter) {
        this.size = size;
        this.presenter = presenter;
        this.spots = new ArrayList<>();
        for (int i = 0; i < this.size * this.size; i++) {
            this.spots.add(String.valueOf(i));
        }
    }

    public List<String> firstRow() {
        List<String> firstRow = new ArrayList<>();
        firstRow.add(this.spots.get(0));
        firstRow.add(this.spots.get(1));
        firstRow.add(this.spots.get(2));
        return firstRow;
    }

    public List<String> secondRow() {
        List<String> secondRow = new ArrayList<>();
        secondRow.add(this.spots.get(3));
        secondRow.add(this.spots.get(4));
        secondRow.add(this.spots.get(5));
        return secondRow;
    }

    public List<String> thirdRow() {
        List<String> thirdRow = new ArrayList<>();
        thirdRow.add(this.spots.get(6));
        thirdRow.add(this.spots.get(7));
        thirdRow.add(this.spots.get(8));
        return thirdRow;
    }

    public List<String> returnRow(int r) {
        List<String> row = new ArrayList<>();
        for (int i = 0; i < r; i++) {
            row.add(spots.get(r * size + i));
        }
        return row;
    }

     //Poor code — can you improve this?
    public void display() {
        presenter.displayBoard(this);
//        String formattedFirstRow = this.spots.get(0) + " | " + this.spots.get(1) + " | " + this.spots.get(2) + "\n"
//            + this.spots.get(3) + " | " + this.spots.get(4) + " | " + this.spots.get(5) + "\n"
//            + this.spots.get(6) + " | " + this.spots.get(7) + " | " + this.spots.get(8);
//        System.out.print(formattedFirstRow);

    }
}

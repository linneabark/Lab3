import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Created by linneabark on 2016-12-15.
 */
public class ReversiScoreView implements PropertyChangeListener{



    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("score")) {
            if (evt.getSource().getClass() == ReversiModel.class) {
                ReversiModel model = (ReversiModel) evt.getSource();
                System.out.println("Black score: " + model.getBlackScore());
                System.out.println("White score: " + model.getWhiteScore());
                if (model.getTurnColor() == ReversiModel.Turn.BLACK) {
                    System.out.println("Player is WHITE");
                } else {
                    System.out.println("Player is BLACK");
                }
            }
        }
    }
}

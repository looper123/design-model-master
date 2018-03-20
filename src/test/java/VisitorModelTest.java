
import com.quark.design.model.VisitorModel.MySubject;
import com.quark.design.model.VisitorModel.MyVisitor;
import com.quark.design.model.VisitorModel.Subject;
import com.quark.design.model.VisitorModel.Visitor;
import org.junit.Test;

/**
 * Created by 311198 on 2017/2/14.
 */
public class VisitorModelTest {

    @Test
    public  void  visitorTest(){
        Visitor visitor = new MyVisitor();
        Subject sub = new MySubject();
        sub.accept(visitor);
    }
}

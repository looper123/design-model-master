import com.itcast.yitao.design.model.builderModel.Builder;
import org.junit.Test;

/**
 * Created by 311198 on 2017/2/8.
 * 建造者模式 把所有的的产品集中和管理
 */
public class BuilderModelTest {

    @Test
    public void buildModelTest(){
        Builder builder = new Builder();
        builder.mailProduceSender(10);
    }

}

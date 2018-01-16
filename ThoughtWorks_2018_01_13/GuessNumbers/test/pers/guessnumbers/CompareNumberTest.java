package pers.guessnumbers;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by 筱湮 on 2018/1/15.
 * 假如系统生成四位不同随机数为“1234”
 */
public class CompareNumberTest {

    @Test
    public void shouldReturn4A0BWhenInputIs1234(){

        CompareNumber compareNumber = new CompareNumber();

        String result = compareNumber.compare("1234","1234");

        assertThat(result, is("4A0B"));
    }

    @Test
    public void shouldReturn3A0BWhenInputIs1235(){

        CompareNumber compareNumber = new CompareNumber();

        String result = compareNumber.compare("1234","1235");

        assertThat(result, is("3A0B"));
    }

    @Test
    public void shouldReturn2A0BWhenInputIs1256(){

        CompareNumber compareNumber = new CompareNumber();

        String result = compareNumber.compare("1234","1256");

        assertThat(result, is("2A0B"));
    }

    @Test
    public void shouldReturn2A1BWhenInputIs1246(){

        CompareNumber compareNumber = new CompareNumber();

        String result = compareNumber.compare("1234","1246");

        assertThat(result, is("2A1B"));
    }

    @Test
    public void shouldReturn2A2BWhenInputIs1243(){

        CompareNumber compareNumber = new CompareNumber();

        String result = compareNumber.compare("1234","1243");

        assertThat(result, is("2A2B"));
    }

    @Test
    public void shouldReturn1A0BWhenInputIs1567(){

        CompareNumber compareNumber = new CompareNumber();

        String result = compareNumber.compare("1234","1567");

        assertThat(result, is("1A0B"));
    }

    @Test
    public void shouldReturn1A1BWhenInputIs1562(){

        CompareNumber compareNumber = new CompareNumber();

        String result = compareNumber.compare("1234","1562");

        assertThat(result, is("1A1B"));
    }

    @Test
    public void shouldReturn1A2BWhenInputIs1543(){

        CompareNumber compareNumber = new CompareNumber();

        String result = compareNumber.compare("1234","1543");

        assertThat(result, is("1A2B"));
    }

    @Test
    public void shouldReturn1A3BWhenInputIs1423(){

        CompareNumber compareNumber = new CompareNumber();

        String result = compareNumber.compare("1234","1423");

        assertThat(result, is("1A3B"));
    }

    @Test
    public void shouldReturn0A0BWhenInputIs5678(){

        CompareNumber compareNumber = new CompareNumber();

        String result = compareNumber.compare("1234","5678");

        assertThat(result, is("0A0B"));
    }

    @Test
    public void shouldReturn0A1BWhenInputIs5673(){

        CompareNumber compareNumber = new CompareNumber();

        String result = compareNumber.compare("1234","5673");

        assertThat(result, is("0A1B"));
    }

    @Test
    public void shouldReturn0A2BWhenInputIs6521(){

        CompareNumber compareNumber = new CompareNumber();

        String result = compareNumber.compare("1234","6521");

        assertThat(result, is("0A2B"));
    }

    @Test
    public void shouldReturn0A3BWhenInputIs5321(){

        CompareNumber compareNumber = new CompareNumber();

        String result = compareNumber.compare("1234","5321");

        assertThat(result, is("0A3B"));
    }

    @Test
    public void shouldReturn0A4BWhenInputIs4321(){

        CompareNumber compareNumber = new CompareNumber();

        String result = compareNumber.compare("1234","4321");

        assertThat(result, is("0A4B"));
    }
}

package cn.windssoft.test2;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017/6/9.
 */
public class FileReaderTester extends TestCase {
    public FileReaderTester(String name) {
        super(name);
    }

    @Override
    protected void setUp() throws Exception {
        try {
            _input = new FileReader("data.txt");
        }
    }
}

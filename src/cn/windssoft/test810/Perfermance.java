package cn.windssoft.test810;

/**
 * Created by Administrator on 2017/6/12.
 */
public class Perfermance {
    private String _name;
    private String _wins;

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public int getWins() {
        return Integer.parseInt(_wins);
    }

    public void setWins(String wins) {
        _wins = wins;
    }
}

package task.usersDAO;

import com.google.gson.Gson;
import org.springframework.stereotype.Component;
import task.users.Rate;

import java.util.ArrayList;
import java.util.List;

@Component
public class RateDAO {

    private List<Rate> rates = new ArrayList<>();

    public void parse(String stringPosts){
        int alreadyPassed=0;
        for(int i=0;i<4;i++) {
            int start = stringPosts.indexOf("{", alreadyPassed);
            int end = stringPosts.indexOf("}", alreadyPassed);
            alreadyPassed=end+1;
            String sub = stringPosts.substring(start, end + 1);
            Gson g = new Gson();
            Rate r = g.fromJson(sub, Rate.class);
            rates.add(r);
        }
    }

    public double getRate(){
        double USDtoUAN=0;
        double BTCtoUSD=0;
        for(int i=0;i<rates.size();i++){
            if(rates.get(i).getCcy().equals("USD")){
                USDtoUAN=(rates.get(i).getBuy()+rates.get(i).getSale())/2;
            }
            if(rates.get(i).getCcy().equals("BTC")){
                BTCtoUSD =(rates.get(i).getBuy()+rates.get(i).getSale())/2;
            }
        }
        return BTCtoUSD * USDtoUAN;
    }

}

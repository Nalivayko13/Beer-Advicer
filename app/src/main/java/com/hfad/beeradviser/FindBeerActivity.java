package com.hfad.beeradviser;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class FindBeerActivity extends AppCompatActivity {

   private BeerExpert expert=new BeerExpert();

    public void onClickFindBeer(View view){
        //Получить ссылку на TextView
        TextView brands = (TextView) findViewById(R.id.brands);
        //Получить ссылку на Spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        //Получить вариант, выбранный в Spinner
        String beerType = String.valueOf(color.getSelectedItem());
        List<String> brandList = expert.getBrands(beerType);
        StringBuilder beersBrand=new StringBuilder();
        for(String brand:brandList){
            beersBrand.append(brand).append("\n");
        }
        brands.setText(beersBrand);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
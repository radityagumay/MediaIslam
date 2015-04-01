package raditya.labs.mediaislam.fragment;

import android.os.AsyncTask;
import android.os.Bundle;
import android.speech.tts.Voice;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import raditya.labs.mediaislam.R;
import raditya.labs.mediaislam.adapter.MainActivityAdapter;
import raditya.labs.mediaislam.model.ArticleModel;

/**
 * Created by raditya on 4/1/2015.
 */
public class FragmentArticle extends Fragment {

    String url = "http://www.androidbegin.com/tutorial/jsouplistview.html";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(MainActivityAdapter.TAG, "FragmentArticle : onCreate");

        new async().execute();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(MainActivityAdapter.TAG, "FragmentArticle : onCreateView");
        View rootView = inflater.inflate(R.layout.fragment_article, container, false);

        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(MainActivityAdapter.TAG, "FragmentArticle : onStart");
    }

    private class async extends AsyncTask<Void, Void, Void>{
        //http://www.survivingwithandroid.com/2014/04/parsing-html-in-android-with-jsoup.html
        //http://www.androidbegin.com/tutorial/android-jsoup-listview-images-texts-html-tables-tutorial/
        List<ArticleModel> models = new ArrayList<ArticleModel>();

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected Void doInBackground(Void... voids) {
            try {
                Document document = Jsoup.connect(url).get();
                Elements select = document.select("media");
                for(Element element : select){
                    ArticleModel model = new ArticleModel();
                    model.setTitle(element.attr("title"));
                    models.add(model);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void voids) {
            super.onPostExecute(voids);

        }
    }
}

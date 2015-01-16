package com.example.customgridview;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
	GridView gridview;
	String[] data = new String[] { "adidas", "agfa", "boss", "dhl", "dove",
			"fanta", "fila", "gucci", "java", "levis", "makro", "mcdonalds",
			"nba", "nestlea", "nike", "nivea", "ny", "omega", "omini", "polo",
			"puma", "rayban", "rolax", };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		gridview = (GridView) findViewById(R.id.GridView1);
		gridview.setAdapter(new CustomAdapter(this));
		
	}

	public class CustomAdapter extends BaseAdapter {

		Context context;

		public CustomAdapter(Context ctx) {
			this.context = ctx;

		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return data.length;
		}

		@Override
		public Object getItem(int poition) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int poition) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int poition, View coverView, ViewGroup parent) {

			View myview = coverView;
			if (myview == null) {
				LayoutInflater li = getLayoutInflater();
				myview = li.inflate(R.layout.grid_view, null);
				TextView tv = (TextView) findViewById(R.id.textView1);
				ImageView iv = (ImageView) findViewById(R.id.imageView1);

				MainActivity.this.runOnUiThread(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						
					}
				});
				try {

					if (data[poition].equals("adidas")) {
						tv.setText(data[poition]);
						iv.setImageResource(R.drawable.adidas);
					} else if (data[poition].equals("agfa")) {
						tv.setText(data[poition]);
						iv.setImageResource(R.drawable.agfa);

					} else if (data[poition].equals("boss")) {
						tv.setText(data[poition]);
						iv.setImageResource(R.drawable.boss);

					} else if (data[poition].equals("dhl")) {
						tv.setText(data[poition]);
						iv.setImageResource(R.drawable.dhl);

					} else if (data[poition].equals("dove")) {
						tv.setText(data[poition]);
						iv.setImageResource(R.drawable.dove);

					} else if (data[poition].equals("fanta")) {
						tv.setText(data[poition]);
						iv.setImageResource(R.drawable.fanta);
					} else if (data[poition].equals("fila")) {
						tv.setText(data[poition]);
						iv.setImageResource(R.drawable.fila);
					} else if (data[poition].equals("gucci")) {
						tv.setText(data[poition]);
						iv.setImageResource(R.drawable.gucci);
					} else if (data[poition].equals("java")) {
						tv.setText(data[poition]);
						iv.setImageResource(R.drawable.gucci);
					}

				} catch (Exception e) {
					e.printStackTrace();
					// TODO: handle exception
				}

			}
			return myview;
		}
	}

}

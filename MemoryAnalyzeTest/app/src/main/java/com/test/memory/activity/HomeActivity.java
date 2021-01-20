package com.test.memory.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.text.TextUtils;

import com.test.memory.fragment.HomeFragment;

public class HomeActivity extends AgentActivity {

  public static void navigate(Context context, Class<? extends Fragment> clazz){
    Intent intent = new Intent(context, HomeActivity.class);
    intent.putExtra("fragment_class", clazz.getName());
    context.startActivity(intent);
  }

  @Override protected Class<? extends Fragment> provideFragmentClass() throws ClassNotFoundException {
    String fragmentClassStr = getIntent().getStringExtra("fragment_class");
    if(!TextUtils.isEmpty(fragmentClassStr)){
      return (Class<? extends Fragment>)Class.forName(fragmentClassStr);
    }
    return null;
  }
}

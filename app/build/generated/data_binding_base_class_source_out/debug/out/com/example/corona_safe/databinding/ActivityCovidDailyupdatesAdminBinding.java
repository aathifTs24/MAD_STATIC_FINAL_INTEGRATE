// Generated by view binder compiler. Do not edit!
package com.example.corona_safe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.corona_safe.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCovidDailyupdatesAdminBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button add;

  @NonNull
  public final Button delete;

  @NonNull
  public final EditText etConfirmed;

  @NonNull
  public final EditText etDeaths;

  @NonNull
  public final EditText etProvince;

  @NonNull
  public final EditText etRecovered;

  @NonNull
  public final FloatingActionButton floatingActionButton3;

  @NonNull
  public final Button selectAll;

  @NonNull
  public final TextView textView16;

  @NonNull
  public final TextView textView17;

  @NonNull
  public final TextView textView20;

  @NonNull
  public final TextView textView23;

  @NonNull
  public final Button update;

  private ActivityCovidDailyupdatesAdminBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button add, @NonNull Button delete, @NonNull EditText etConfirmed,
      @NonNull EditText etDeaths, @NonNull EditText etProvince, @NonNull EditText etRecovered,
      @NonNull FloatingActionButton floatingActionButton3, @NonNull Button selectAll,
      @NonNull TextView textView16, @NonNull TextView textView17, @NonNull TextView textView20,
      @NonNull TextView textView23, @NonNull Button update) {
    this.rootView = rootView;
    this.add = add;
    this.delete = delete;
    this.etConfirmed = etConfirmed;
    this.etDeaths = etDeaths;
    this.etProvince = etProvince;
    this.etRecovered = etRecovered;
    this.floatingActionButton3 = floatingActionButton3;
    this.selectAll = selectAll;
    this.textView16 = textView16;
    this.textView17 = textView17;
    this.textView20 = textView20;
    this.textView23 = textView23;
    this.update = update;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCovidDailyupdatesAdminBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCovidDailyupdatesAdminBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_covid_dailyupdates_admin, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCovidDailyupdatesAdminBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add;
      Button add = rootView.findViewById(id);
      if (add == null) {
        break missingId;
      }

      id = R.id.delete;
      Button delete = rootView.findViewById(id);
      if (delete == null) {
        break missingId;
      }

      id = R.id.etConfirmed;
      EditText etConfirmed = rootView.findViewById(id);
      if (etConfirmed == null) {
        break missingId;
      }

      id = R.id.etDeaths;
      EditText etDeaths = rootView.findViewById(id);
      if (etDeaths == null) {
        break missingId;
      }

      id = R.id.etProvince;
      EditText etProvince = rootView.findViewById(id);
      if (etProvince == null) {
        break missingId;
      }

      id = R.id.etRecovered;
      EditText etRecovered = rootView.findViewById(id);
      if (etRecovered == null) {
        break missingId;
      }

      id = R.id.floatingActionButton3;
      FloatingActionButton floatingActionButton3 = rootView.findViewById(id);
      if (floatingActionButton3 == null) {
        break missingId;
      }

      id = R.id.selectAll;
      Button selectAll = rootView.findViewById(id);
      if (selectAll == null) {
        break missingId;
      }

      id = R.id.textView16;
      TextView textView16 = rootView.findViewById(id);
      if (textView16 == null) {
        break missingId;
      }

      id = R.id.textView17;
      TextView textView17 = rootView.findViewById(id);
      if (textView17 == null) {
        break missingId;
      }

      id = R.id.textView20;
      TextView textView20 = rootView.findViewById(id);
      if (textView20 == null) {
        break missingId;
      }

      id = R.id.textView23;
      TextView textView23 = rootView.findViewById(id);
      if (textView23 == null) {
        break missingId;
      }

      id = R.id.update;
      Button update = rootView.findViewById(id);
      if (update == null) {
        break missingId;
      }

      return new ActivityCovidDailyupdatesAdminBinding((ConstraintLayout) rootView, add, delete,
          etConfirmed, etDeaths, etProvince, etRecovered, floatingActionButton3, selectAll,
          textView16, textView17, textView20, textView23, update);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
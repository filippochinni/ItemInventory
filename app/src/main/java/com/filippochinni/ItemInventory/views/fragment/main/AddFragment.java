package com.filippochinni.ItemInventory.views.fragment.main;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.filippochinni.ItemInventory.R;
import com.filippochinni.ItemInventory.viewmodels.AddViewModel;
import com.google.android.material.textfield.TextInputEditText;

public class AddFragment extends Fragment {
	private AddViewModel mAddViewModel;

	private TextInputEditText inputTextName;
	private TextInputEditText inputTextAddress;
	private TextInputEditText inputTextNotes;
	private Button buttonAdd;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_main_add, container, false);

		this.mAddViewModel = new ViewModelProvider(this).get(AddViewModel.class);

		this.inputTextName = view.findViewById(R.id.input_text_add_site_name);
		this.inputTextAddress = view.findViewById(R.id.input_text_add_site_address);
		this.inputTextNotes = view.findViewById(R.id.input_text_add_site_notes);
		this.buttonAdd = view.findViewById(R.id.input_button_add_site);

		return view;
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);

		//TODO fix this
		String name = inputTextName.getText().toString();
		String address = inputTextAddress.getText().toString();
		String notes = inputTextNotes.getText().toString();

		buttonAdd.setOnClickListener(v -> eseguiAggiunta());
	}

	//TODO remove this method
	public void eseguiAggiunta() {
		String name = inputTextName.getText().toString();
		String address = inputTextAddress.getText().toString();
		String notes = inputTextNotes.getText().toString();

		mAddViewModel.addNewSite(name, address, notes);
	}


}

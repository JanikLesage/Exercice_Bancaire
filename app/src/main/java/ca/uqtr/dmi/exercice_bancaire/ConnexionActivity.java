package ca.uqtr.dmi.exercice_bancaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import ca.uqtr.dmi.exercice_bancaire.databinding.ActivityConnexionBinding;

public class ConnexionActivity extends AppCompatActivity {
    private ActivityConnexionBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityConnexionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.login.setOnClickListener(this::onLoginButtonClicked);
    }

    private void onLoginButtonClicked(android.view.View view) {
        if(binding.username.getText().toString().equals("admin") && binding.password.getText().toString().equals("1234")){
            Intent intent = new Intent(this, MainMenuActivity.class);
            startActivity(intent);
        }
    }
}
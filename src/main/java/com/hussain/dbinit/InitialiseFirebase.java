package com.hussain.dbinit;

import java.io.FileInputStream;
import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

@Service
public class InitialiseFirebase {

	@PostConstruct
	public void initialiseFirebase() throws IOException {

		FileInputStream serviceAccount = new FileInputStream("./test-8d59a-firebase-adminsdk-wzqhr-597f1c8f70.json");

		FirebaseOptions options = new FirebaseOptions.Builder()
				.setCredentials(GoogleCredentials.fromStream(serviceAccount))
				.setDatabaseUrl("https://test-8d59a.firebaseio.com").build();

		FirebaseApp.initializeApp(options);

	}

}

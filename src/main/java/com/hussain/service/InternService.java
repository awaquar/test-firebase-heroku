package com.hussain.service;

import org.springframework.stereotype.Service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.hussain.model.Intern;

@Service
public class InternService {
	
	
	public static void saveIntern(Intern intern) {
	
		Firestore dbFirestore=FirestoreClient.getFirestore();
		
		ApiFuture<WriteResult> future = dbFirestore.collection("Interns").document(intern.getId()).set(intern);
	}

}

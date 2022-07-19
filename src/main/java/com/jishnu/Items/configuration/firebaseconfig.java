package com.jishnu.Items.configuration;

import java.io.FileInputStream;
import java.io.IOException;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreOptions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

import org.springframework.context.annotation.Configuration;

@Configuration
public class firebaseconfig{
    public Firestore initialize() throws IOException{

        FileInputStream serviceAccount =
        new FileInputStream("bigbuzzz-b05ae-firebase-adminsdk-3tlh2-3211797598.json");


        GoogleCredentials credentials = GoogleCredentials.fromStream(serviceAccount);
        FirestoreOptions options = FirestoreOptions.newBuilder()
                .setCredentials(credentials)
                .setProjectId("bigbuzzz-b05ae")
                .build();
        Firestore db = options.getService();
        return db;

    }
}

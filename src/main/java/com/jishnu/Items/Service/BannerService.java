package com.jishnu.Items.Service;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.jishnu.Items.configuration.firebaseconfig;
import com.jishnu.Items.model.Banner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BannerService {

    @Autowired
    firebaseconfig config;

    Firestore db;

    public BannerService() throws Exception {
        config = new firebaseconfig();
        this.db = config.initialize();
    }

    public String addItem(Banner banner) throws InterruptedException, ExecutionException{
        System.out.println(banner);
        return "hello";
        // CollectionReference colRef = this.db.collection("Items");
        // Map<String, Banner> data = new HashMap<>();
        // data.put(UUID.randomUUID().toString() , item );
        // ApiFuture<DocumentReference> result = colRef.add(item);
        // System.out.println(result.toString());
        // return result.get().getId();
    }

    public Map<String, Banner> getAllBanner() throws InterruptedException, ExecutionException {
        ApiFuture<QuerySnapshot> data = db.collection("Banner").get();
        List<QueryDocumentSnapshot> documents = data.get().getDocuments();
        Map<String, Banner> result = new HashMap<>();
        for (QueryDocumentSnapshot document : documents) 
        {
            System.out.println(document.getGeoPoint("latLng"));
            result.put(document.getId(), document.toObject(Banner.class));
        }
        return result;
    }
}

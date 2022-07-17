package com.jishnu.Items.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.Query;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.jishnu.Items.configuration.firebaseconfig;
import com.jishnu.Items.model.Items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    @Autowired
    firebaseconfig config;

    Firestore db;

    public ItemService() throws Exception {
        config = new firebaseconfig();
        this.db = config.initialize();
    }

    public String addItem(Items item) throws InterruptedException, ExecutionException{
        CollectionReference colRef = this.db.collection("Items");
        Map<String, Items> data = new HashMap<>();
        data.put(UUID.randomUUID().toString() , item );
        ApiFuture<DocumentReference> result = colRef.add(item);
        System.out.println(result.toString());
        return result.get().getId();
    }

    public Map<String,Items> getAllItems() throws InterruptedException, ExecutionException
    {
        ApiFuture<QuerySnapshot> data = db.collection("Items").get();
        List<QueryDocumentSnapshot> documents = data.get().getDocuments();
        Map<String, Items> result = new HashMap<>();
        for (QueryDocumentSnapshot document : documents) 
        {
            result.put(document.getId(), document.toObject(Items.class));
        }
        return result;
    }

    public Map<String, Object> getById(String Id) throws InterruptedException, ExecutionException
    {
        DocumentReference docRef = db.collection("Items").document(Id);
        ApiFuture<DocumentSnapshot> future = docRef.get();
        DocumentSnapshot document = future.get();
        if (document.exists()) 
        {
            return document.getData();
        }
        return null;
    }

    public Map<String, Object> update(String Id,Items item) throws InterruptedException, ExecutionException
    {
        Map<String,Object> map = new HashMap<String, Object>();
        if(item.getBarcode()!=null) map.put("barcode", item.getBarcode());
        if(item.getCategory()!=null) map.put("category", item.getCategory());
        if(item.getGroup()!=null) map.put("group", item.getGroup());
        if(item.getImageUrl()!=null) map.put("imageUrl", item.getImageUrl());
        if(item.getItemName()!=null) map.put("itemName", item.getItemName());
        if(item.getMrp1()!=null) map.put("mrp1", item.getMrp1());
        if(item.getPrice1() != 0) map.put("price1", item.getPrice1());
        if(item.getQty1()!=null) map.put("qty1", item.getQty1());
        if(item.getSubCategory()!=null) map.put("subCategory", item.getSubCategory());
        if(item.getType()!=null) map.put("type", item.getType());
        if(item.getUnit1()!=null) map.put("unit1", item.getUnit1());

        DocumentReference docRef = db.collection("Items").document(Id);

        ApiFuture<WriteResult> future = docRef.update(map);
        WriteResult result = future.get();
        System.out.println("Write result: " + result);
        return null;
    }

    public WriteResult delete(String Id) throws InterruptedException, ExecutionException {
        ApiFuture<WriteResult> writeResult = db.collection("Items").document(Id).delete();
        System.out.println(writeResult.isDone());
        System.out.println("Update time : " + writeResult.get().getUpdateTime());
        return writeResult.get();
    }

    public List<String> greater(int price1) throws InterruptedException, ExecutionException
    {
        CollectionReference items = db.collection("Items");
        Query query = items.whereGreaterThanOrEqualTo("price1", price1);
        ApiFuture<QuerySnapshot> querySnapshot = query.get();
        List<String> list = new ArrayList<String>();
        for (DocumentSnapshot document : querySnapshot.get().getDocuments()) {
            list.add(document.getId());
        }
        return list;
    }
    public List<String> lesser(int price1) throws InterruptedException, ExecutionException
    {
        CollectionReference items = db.collection("Items");
        Query query = items.whereLessThan("price1", price1);
        ApiFuture<QuerySnapshot> querySnapshot = query.get();
        List<String> list = new ArrayList<String>();
        for (DocumentSnapshot document : querySnapshot.get().getDocuments()) {
            list.add(document.getId());
        }
        return list;
    }
}


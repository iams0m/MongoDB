package com.multi.mongoDB;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;

public class MongoDBTest4_update {

	public static void main(String[] args) {
		// 1. MongoDB 연결
		MongoClient client = new MongoClient("localhost", 27017);
		System.out.println("1. MongoDB 연결 성공");
		// 2. shop2로 연결
		MongoDatabase database = client.getDatabase("shop2");
		System.out.println("2. shop2로 연결 성공");
		// 3. Memo Collection에 연결
		MongoCollection<org.bson.Document> collection = database.getCollection("memo");
		System.out.println("3. memo Collection에 연결 성공");

		// 업데이트할 조건을 json(Document)로 만들어주세요.
		Document filter = new Document();
		filter.append("age", 501);
		
		Bson set = Updates.set("name", "song");
		
		collection.updateOne(filter, set);
		System.out.println("4. updateOne 성공");
		
	}

}

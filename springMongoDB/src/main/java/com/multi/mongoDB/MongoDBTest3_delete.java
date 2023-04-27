package com.multi.mongoDB;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest3_delete {

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
		
		// 삭제할 조건을 json(Document)로 만들어주세요.
		Document filter = new Document();
		filter.append("age", 500);
		
		collection.deleteOne(filter);
		client.close();
		System.out.println("4. deleteOne 성공");

	}

}

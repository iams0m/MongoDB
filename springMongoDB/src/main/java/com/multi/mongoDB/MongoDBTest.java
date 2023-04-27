package com.multi.mongoDB;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest {

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

	}

}

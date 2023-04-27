package com.multi.mongoDB;

import java.util.Scanner;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest2_insert2 {

	public static void main(String[] args) {
		// 1. MongoDB 연결
		MongoClient client = new MongoClient("localhost", 27017);
		System.out.println("1. MongoDB 연결 성공");
		// 2. shop2로 연결
		MongoDatabase database = client.getDatabase("shop2");
		System.out.println("2. shop2로 연결 성공");
		// 3. Memo Collection에 연결
		//MongoCollection<org.bson.Document> collection = database.getCollection("member");
		//System.out.println("3. Member Collection에 연결 성공");
		MongoCollection<org.bson.Document> collection = database.getCollection("memo");
		System.out.println("3. memo Collection에 연결 성공");

		Scanner sc = new Scanner(System.in);
		// 자바프로그램 <--연결설정(강물, 스트림)----- 콘솔
		System.out.print("age입력>>");
		String age = sc.next();
		System.out.print("name입력>>");
		String name = sc.next();
		System.out.print("office입력>>");
		String office = sc.next();
		System.out.print("phone입력>>");
		String phone = sc.next();
		sc.close();

		Document doc = new Document();
		doc.append("age", age);
		doc.append("name", name);
		doc.append("office", office);
		doc.append("phone", phone);

		collection.insertOne(doc);
		System.out.println("4. memo Collection에 insertOne 성공");
	}

}

use shop10

db.memo.find({})

db.memo.find({"name" : "apple"})

db.memo.find({"age" : 100})

db.createCollection("member")

db.member.stats()

db.member.insertOne({
    "name" : "hong",
    "age" : 100,
    "tel" : "010"
})

db.mmeber.find({})

db.createCollection("bbs")

db.bbs.insertOne({"title" : "win"})

db.bbs.find({})

db.dropDatabase()

show databases

db.createUser({
    user : "winner",
    pwd : "1234",
    roles : ["readWrite", "dbAdmin"]
})

db.memo.countDocuments({})

db.memo.insertOne({
   "name" : "apple",
   "age" : 100
})


use shop5

db.memo.find({})

show databases

db.createCollection("member")

show collections

db.member.find({})

db.member.insert({
    "id" : "hong",
    "pw" : "1234",
    "name" : "honggildong",
    "tel" : "011"
})

db.member.insert({
    "id" : "kim",
    "pw" : "1234",
    "name" : "kimgildong",
    "tel" : "012"
})

db.member.insert({
    "id" : "park",
    "pw" : "1234",
    "name" : "parkgildong",
    "tel" : "013"
})

db.member.drop()

show collections

db.dropDatabase()

show dbs

db.getCollection("memo").find({})

db.memo.find({name : "Tom", office : "Seoul"}, {phone : 1})

db.memo.find({$or : [{age : 10}, {office : "Wordware"}]}).count()

db.memo.find({$or : [{age : 10}, {office : "Wordware"}]}, {name : 1})

db.memo.find({office : "Busan"}, {_id : 0, age : 0})

db.memo.find({office : { $not : /busan/}}, {office : 1, phone : 1})

db.memo.find({office : "Seoul"}, {phone : 1, name : 1}).limit(2)

db.memo.deleteOne({office : "Wordware"})

db.memo.find({office : "Wordware"})

db.memo.updateMany({office : "Seoul"}, {$set : {phone : "999"}})

db.memo.find({office : "Seoul"}, {phone : 1})

db.memo.deleteMany({})

db.memo.find({}).count()
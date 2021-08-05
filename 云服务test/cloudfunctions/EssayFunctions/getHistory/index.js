const cloud = require('wx-server-sdk')

cloud.init({
  env: cloud.DYNAMIC_CURRENT_ENV
})
const db = cloud.database()

// 查询数据库集合云函数入口函数
exports.main = async (event, context) => {
  // 返回数据库查询结果
  db.collection('eventList').where({
    date: event.date,
  })
  .get({
    success: function(res) {
      // res.data 是包含以上定义的两条记录的数组
      console.log(res);
      return res;
    }
  })
}
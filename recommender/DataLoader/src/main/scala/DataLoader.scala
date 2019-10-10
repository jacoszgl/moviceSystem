import org.apache.spark.sql.hive.HiveContext
import org.apache.spark.{SparkConf, SparkContext}

/**
  *
  */
object DataLoader {

  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf().setMaster("local[2]").setAppName("testSpark")
    val sc = new SparkContext(sparkConf);
    val sqlContext =  new HiveContext(sc);
    sqlContext.sql("select * from test1").show();

  }
}

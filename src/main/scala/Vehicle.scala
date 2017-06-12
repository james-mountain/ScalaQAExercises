/**
  * Created by Administrator on 08/06/2017.
  */
abstract class Vehicle() {
  val registration : String
  val modelName : String
  val parts : List[Part]
  var repairedBy : Option[Employee]
  var repairStartTime : Int = 0

  def finishedRepairs(timesinceopen : Int) : Boolean = repairedBy match {
    case Some(employee) => employee.timeAvailable <= timesinceopen
    case None => false
  }
}
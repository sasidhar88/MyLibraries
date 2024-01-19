def goal = 'clean build'
def mystage = 'build'
mvnBuild(goal,mystage) 
def mvnBuild (goal,mystage) {

  sh """
  echo "This is dfrom the shared library and Hello"
  echo $goal
  echo $mystage
  """
}

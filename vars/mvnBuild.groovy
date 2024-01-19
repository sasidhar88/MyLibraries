def goal = 'clean build'
def mystage = 'build'

def call () {

  sh """
  echo "This is dfrom the shared library and Hello"
  echo $goal
  echo $mystage
  """
}

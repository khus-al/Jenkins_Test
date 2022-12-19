pipeline {
agent any
parameters {
string(name: 'myParameter', defaultValue: 'myVal', description: 'Enter Parameter value?')
}
stages {
stage('Build1') {
steps {
echo 'Building..'
echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
}
}
stage('Test1') {
steps {
echo 'Testing..'
echo "${params.myParameter} is value retrieved!"
}
}
stage('Deploy1') {
steps {
echo 'Deploying....'
}
}
}
}

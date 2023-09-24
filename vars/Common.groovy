def call(String stageName){
  
  if("${stageName}" == "Build"){
    echo "Building package"
    sh "mvn package"
    echo "Building done"
  }
  else if("${stageName}" == "Test"){
    echo "Testing with Sonarqube"
    sh "mvn sonar:sonar"
    echo "Testing done"
  }
  else if("${stageName}" == "Deploy"){
    echo "Deploying to Nexus"
    sh "mvn deploy"
    echo "Deployment done"
  }
}


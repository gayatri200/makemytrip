pipeline {
    agent any

    stage("Code Compilation")
    	{
         steps
         {
          echo "Code Compilation"
    	  sh 'mvn clean compile'
          echo 'Code Compilation Completed Successfully!'

         }
    stage("Code Package")
    {
    steps
    {
    echo "COde Package";
    sh 'mvn clean package'
    echo 'COde package Successfully'
    }
    }

    }
}

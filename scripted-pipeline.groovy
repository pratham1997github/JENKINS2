node {  
    stage('Pull') { 
        echo 'Pull Success'
    }
    stage('Build') { 
        echo 'Build success'
    }
    stage('Test') { 
        echo 'Test Done'
    }
    stage('Deploy') { 
        echo 'Application Deploy'
    }
    
}
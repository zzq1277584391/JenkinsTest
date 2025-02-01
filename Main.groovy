pipeline {
    agent { label 'WIN10' }

    stages {
        stage('Build') {
            steps {
                script {
                    // 简单输出确认任务正在执行
                    echo "Hello from WIN10 node!"
                }
            }
        }
    }
}
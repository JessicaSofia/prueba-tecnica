                        ┌────────────────────────────┐
                        │    azure-pipelines.yml     │
                        │   (Pipeline principal)     │
                        └────────────┬───────────────┘
                                     │
          ┌──────────────────────────┴──────────────────────────┐
          │                                                     │
      ┌───▼────┐                                            ┌────▼─────┐
      │ Stage: │                                            │ Stage:   │
      │   CI   │                                            │   CD     │
      └───┬────┘                                            └────┬─────┘
          │                                                     │
          ▼                                                     ▼
┌────────────────────┐                           ┌────────────────────────────┐
│ Job: Build & Test  │                           │ Job: Docker Build & Push   │
│────────────────────│                           │────────────────────────────│
│ - Instala JDK 17    │                           │ - Usa Dockerfile            │
│ - SonarCloudPrepare │                           │ - Construye imagen          │
│ - ./gradlew build   │                           │ - Publica en Docker Hub     │
│ - Sonar Analyze     │                           └────────────────────────────┘
│ - Quality Gate      │
└────────────────────┘

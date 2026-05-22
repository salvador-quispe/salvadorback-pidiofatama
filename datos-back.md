# Comandos Kubernetes - Salvador Demo

## Verificar Namespace
```bash
kubectl get namespaces | grep salvador
```

## Ver todos los recursos del namespace
```bash
kubectl get all -n salvador
```

## Ver pods (deben estar RUNNING)
```bash
kubectl get pods -n salvador
```

## Ver service
```bash
kubectl get svc -n salvador
```

---

## Mostrar que los pods están funcionando

### Ver detalles de los pods
```bash
kubectl get pods -n salvador -o wide
```

### Ver logs de un pod (para mostrar que está activo)
```bash
kubectl logs -n salvador --selector=app=salvador
```

---

## Aplicar manifiestos
```bash
kubectl apply -f k8s/00-Salvador-namespace.yml
kubectl apply -f k8s/01-Salvador-secret.yml
kubectl apply -f k8s/02-Salvador-configmap.yml
kubectl apply -f k8s/03-Salvador-deployment.yml
kubectl apply -f k8s/04-Salvador-service.yml
```

## O aplicar todos de una vez
```bash
kubectl apply -f k8s/
```

---

## Endpoints de la API

| Método | URL |
|--------|-----|
| GET    | http://localhost:30080/api/v1/personas |
| GET    | http://localhost:30080/api/v1/personas/{id} |
| POST   | http://localhost:30080/api/v1/personas |
| PUT    | http://localhost:30080/api/v1/personas/{id} |
| DELETE | http://localhost:30080/api/v1/personas/{id} |

### Body para POST / PUT (JSON)
```json
{
    "nombre": "Carlos",
    "apellido": "Lopez",
    "email": "carlos@example.com"
}
```

---

## Docker

### Build y push de la imagen
```bash
docker build -t salvaqc/salvador-demo:latest .
docker login
docker push salvaqc/salvador-demo:latest
```

### Reiniciar deployment
```bash
kubectl rollout restart deployment salvador-deployment -n salvador
```

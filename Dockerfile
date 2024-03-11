# Étape 1: Construire l'application Angular
FROM node:18.13.0 AS build
ENV NODE_OPTIONS=--openssl-legacy-provider
WORKDIR /app
COPY package.json package-lock.json ./
RUN npm install
COPY . .
RUN npm run build

# Étape 2: Servir l'application avec Nginx
FROM nginx:alpine
COPY --from=build /app/dist/partieweb /usr/share/nginx/html
COPY nginx.conf /etc/nginx/conf.d/default.conf
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]

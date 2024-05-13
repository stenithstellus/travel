FROM node:20.8 AS build
WORKDIR /app
COPY package.json package-lock.json ./
RUN npm install --force
COPY . .
CMD ["npm", "start", "--","--host","0.0.0.0"]
    
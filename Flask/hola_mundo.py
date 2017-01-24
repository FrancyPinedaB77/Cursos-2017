from flask import Flask
app = Flask(__name__) # nuevo objeto
@app.route('/')       # wrap o un decorador
def index ():		  # Se usa una funcion
	return 'Hola mundo'
app.run() # Ejecuta el servidor por default en el puerto 5000


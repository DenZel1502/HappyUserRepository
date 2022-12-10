from django.db import models

# Create your models here.

class Dispositivo(models.Model):
    id = models.AutoField(primary_key=True)
    dni = models.DecimalField(max_digits=8, decimal_places=0)    

class Usuario(models.Model):
    id = models.AutoField(primary_key=True)
    apellido = models.CharField('Apellidos', max_length=100)
    nombre = models.CharField('Nombres',max_length=100)
    dni = models.DecimalField(max_digits=8, decimal_places=0)
    correo = models.EmailField()
    dispositivo = models.ForeignKey(Dispositivo,on_delete=models.CASCADE)

    def __str__(self):
        return self.apellido
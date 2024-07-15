package org.example;

public class GenericClasses<T> {
       T containt;

       public GenericClasses(T containt) {
              this.containt = containt;
       }

       public T getContaint() {
              return containt;
       }

       public void setContaint(T containt) {
              this.containt = containt;
       }
}

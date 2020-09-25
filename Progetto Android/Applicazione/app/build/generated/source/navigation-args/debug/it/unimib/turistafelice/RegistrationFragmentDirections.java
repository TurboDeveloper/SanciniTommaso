package it.unimib.turistafelice;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class RegistrationFragmentDirections {
  private RegistrationFragmentDirections() {
  }

  @NonNull
  public static RegisteredLoggedSuccess registeredLoggedSuccess() {
    return new RegisteredLoggedSuccess();
  }

  @NonNull
  public static AlreadyRegisteredAction alreadyRegisteredAction() {
    return new AlreadyRegisteredAction();
  }

  public static class RegisteredLoggedSuccess implements NavDirections {
    private final HashMap arguments = new HashMap();

    private RegisteredLoggedSuccess() {
    }

    @NonNull
    public RegisteredLoggedSuccess setLogged(boolean logged) {
      this.arguments.put("logged", logged);
      return this;
    }

    @NonNull
    public RegisteredLoggedSuccess setRegisteredSuccess(boolean registeredSuccess) {
      this.arguments.put("registeredSuccess", registeredSuccess);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("logged")) {
        boolean logged = (boolean) arguments.get("logged");
        __result.putBoolean("logged", logged);
      } else {
        __result.putBoolean("logged", true);
      }
      if (arguments.containsKey("registeredSuccess")) {
        boolean registeredSuccess = (boolean) arguments.get("registeredSuccess");
        __result.putBoolean("registeredSuccess", registeredSuccess);
      } else {
        __result.putBoolean("registeredSuccess", true);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.registeredLoggedSuccess;
    }

    @SuppressWarnings("unchecked")
    public boolean getLogged() {
      return (boolean) arguments.get("logged");
    }

    @SuppressWarnings("unchecked")
    public boolean getRegisteredSuccess() {
      return (boolean) arguments.get("registeredSuccess");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      RegisteredLoggedSuccess that = (RegisteredLoggedSuccess) object;
      if (arguments.containsKey("logged") != that.arguments.containsKey("logged")) {
        return false;
      }
      if (getLogged() != that.getLogged()) {
        return false;
      }
      if (arguments.containsKey("registeredSuccess") != that.arguments.containsKey("registeredSuccess")) {
        return false;
      }
      if (getRegisteredSuccess() != that.getRegisteredSuccess()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getLogged() ? 1 : 0);
      result = 31 * result + (getRegisteredSuccess() ? 1 : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "RegisteredLoggedSuccess(actionId=" + getActionId() + "){"
          + "logged=" + getLogged()
          + ", registeredSuccess=" + getRegisteredSuccess()
          + "}";
    }
  }

  public static class AlreadyRegisteredAction implements NavDirections {
    private final HashMap arguments = new HashMap();

    private AlreadyRegisteredAction() {
    }

    @NonNull
    public AlreadyRegisteredAction setNotLogged(boolean notLogged) {
      this.arguments.put("notLogged", notLogged);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("notLogged")) {
        boolean notLogged = (boolean) arguments.get("notLogged");
        __result.putBoolean("notLogged", notLogged);
      } else {
        __result.putBoolean("notLogged", true);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.alreadyRegisteredAction;
    }

    @SuppressWarnings("unchecked")
    public boolean getNotLogged() {
      return (boolean) arguments.get("notLogged");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      AlreadyRegisteredAction that = (AlreadyRegisteredAction) object;
      if (arguments.containsKey("notLogged") != that.arguments.containsKey("notLogged")) {
        return false;
      }
      if (getNotLogged() != that.getNotLogged()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getNotLogged() ? 1 : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "AlreadyRegisteredAction(actionId=" + getActionId() + "){"
          + "notLogged=" + getNotLogged()
          + "}";
    }
  }
}

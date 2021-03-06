package consul.v1

import consul.v1.common.WrappedType

package object session {
  type SessionId = WrappedType[String,SessionIds]
  def SessionId:String => SessionId = WrappedType.apply
}

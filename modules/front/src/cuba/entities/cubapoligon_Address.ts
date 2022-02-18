import { EmbeddableEntity } from "./base/sys$EmbeddableEntity";
export class Address extends EmbeddableEntity {
  static NAME = "cubapoligon_Address";
  city?: string | null;
  street?: string | null;
  number?: string | null;
}
export type AddressViewName = "_base" | "_local" | "_minimal";
export type AddressView<V extends AddressViewName> = V extends "_base"
  ? Pick<Address, "city" | "street" | "number">
  : V extends "_local"
  ? Pick<Address, "city" | "street" | "number">
  : never;
